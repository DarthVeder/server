import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.Vector;
import PHT.*;

class example {
  // Compile with "javac example" 
  public static void main(String[] args) throws Exception {

   // Definition of a Proposals with given fields:

    ProposalsOuterClass.Proposals.Builder proposal =  ProposalsOuterClass.Proposals.newBuilder();
    proposal.setAbstract("My new survey abstract");
    proposal.setProposalStatus(ProposalStatusOuterClass.ProposalStatus.Draft);
    proposal.setProposalType(ProposalTypeOuterClass.ProposalType.TOO);


    // Adding CoAuthors
    CoAuthorsOuterClass.CoAuthors.Builder coa = CoAuthorsOuterClass.CoAuthors.newBuilder();
    coa.setAuthorId(57);
    proposal.setMCoAuthors(coa);

    // Adding Science Goals
    ScienceGoalsOuterClass.ScienceGoals.Builder sciencegoals = ScienceGoalsOuterClass.ScienceGoals.newBuilder();
    sciencegoals.setFrequence(117.10);
    sciencegoals.setInstrumentConfigurations("Twin interferometer");
    sciencegoals.setMoreInfo("--");
    sciencegoals.setTargetDetails("Jupiter and its satellites");
    proposal.setMScienceGoals(sciencegoals);

    // Adding SupportingDocuments:
    // First you need to insert the local file name and local path into the DB. Then, once you have the proposal id,
    // one can insert the files.
    SupportingDocumentsOuterClass.SupportingDocuments.Builder supdocs = SupportingDocumentsOuterClass.SupportingDocuments.newBuilder();

    String scifile = "1457_e.pdf";	
    supdocs.setScientificJustification("1457_e.pdf");
    
    String techfile = "2784600.jpg";	
    supdocs.setTechnicalJustification("2784600.jpg");

    String preprint = "text.txt";	
    supdocs.setPreprints("text.txt");
    proposal.setMSupportingDocuments(supdocs);

    // Sending proposal
    StringBuffer error = new StringBuffer("");
    StringBuffer proposal_id = new StringBuffer("");

    // Loop for inserting multiple proposals
    //for (int i=1; i<1000; i++)
    //{
    //    proposal_id = apioda.insertNewProposal(proposal.build(),error);
    //    System.out.println(i+" ID: "+proposal_id);
    //}
  
    proposal_id = apioda.insertNewProposal(proposal.build(),error);
    System.out.println("Error new insert: "+error);
    System.out.println("Proposal ID: "+proposal_id);
	   
    // Here, after I inserted the proposal in the DB, I can upload the files of this proposal using 
    // its proposal_id.
    // Inserting supporting documents for given proposal_id:
    int pid = Integer.parseInt(proposal_id.toString());
    System.out.println("Val: "+pid);
    apioda.uploadFile(pid,"./supportingDocuments/",scifile);
    apioda.uploadFile(pid,"./supportingDocuments/",techfile);
    apioda.uploadFile(pid,"./supportingDocuments/",preprint);



/*    
    // The following part demostrates how to use other apioda method.

    // Requesting proposal with ID = my_proposal_ID
    int my_proposal_id = pid;
    ProposalsOuterClass.Proposals pID = apioda.getProposalWithID(my_proposal_id);
    ScienceGoalsOuterClass.ScienceGoals sg = pID.getMScienceGoals();
 

    System.out.println("Retrieved proposal: "+pID.getProposalId());
    System.out.println("ScienceGoals Frequency: "+sg.getFrequence());

 
    // Modifyng an existing proposal in the DB, with a known proposal_id (in the following case, the
    // same as the latest proposal inserted.
    proposal.setAbstract("testAbs");
    int id = Integer.parseInt(proposal_id.toString());
    proposal.setProposalId(id);
    //System.out.println(proposal.getAbstract());
    apioda.modifyProposal(proposal.build(),error);
    System.out.println("Error modify: "+error);


StringBuffer my_error = new StringBuffer("");
ProposalsOuterClass.Proposals.Builder proposal_new = ProposalsOuterClass.Proposals.newBuilder();
proposal_new.setProposalId(Integer.parseInt(proposal_id.toString()));
ScienceGoalsOuterClass.ScienceGoals.Builder scienceGoals = ScienceGoalsOuterClass.ScienceGoals.newBuilder();
scienceGoals.setTargetDetails("TEST mio");
scienceGoals.setFrequence(666.6);
scienceGoals.setInstrumentConfigurations("TEST mio");
scienceGoals.setMoreInfo("TEST mio");
proposal_new.setMScienceGoals(scienceGoals);
apioda.modifyProposal(proposal_new.build(),my_error);

    // Returning all proposals with a given status
    Vector<ProposalsOuterClass.Proposals> p_l = new Vector<ProposalsOuterClass.Proposals>();
    System.out.println("Requesting proposals list with status: "+PHT.ProposalStatusOuterClass.ProposalStatus.Draft);
    p_l = apioda.requestProposalsWithStatus(PHT.ProposalStatusOuterClass.ProposalStatus.Draft);

    System.out.println("Found : "+p_l.size());
*/
    // Delete scifile and its entry in the database for proposal pid:
    System.out.println("Deleting: "+pid+" File "+scifile);
    apioda.deleteFile(pid,scifile);	    	
  }
}

