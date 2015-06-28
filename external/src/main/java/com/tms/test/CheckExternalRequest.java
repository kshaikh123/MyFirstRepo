package com.tms.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
/*
import com.interwoven.cssdk.access.CSAuthorizationException;
import com.interwoven.cssdk.access.CSExpiredSessionException;
import com.interwoven.cssdk.common.CSClient;
import com.interwoven.cssdk.common.CSException;
import com.interwoven.cssdk.common.CSObjectNotFoundException;
import com.interwoven.cssdk.common.CSRemoteException;
import com.interwoven.cssdk.filesys.CSAreaRelativePath;
import com.interwoven.cssdk.filesys.CSFile;
import com.interwoven.cssdk.filesys.CSHole;
import com.interwoven.cssdk.filesys.CSSimpleFile;
import com.interwoven.cssdk.filesys.CSVPath;
import com.interwoven.cssdk.workflow.CSExternalTask;
import com.interwoven.cssdk.workflow.CSURLExternalTask;
*/
public class CheckExternalRequest{
	//implements CSURLExternalTask {
}
/*

    public void execute(CSClient client, CSExternalTask task, @SuppressWarnings("rawtypes") Hashtable arg2) throws CSException {
         System.out.println("In Execute Method: ");
         System.out.println("client: "+client);
         System.out.println("task: "+task);
         System.out.println("arg2: "+arg2);
         CSAreaRelativePath[] fileList =task.getFiles();
         System.out.println("Attached Files siz : "+fileList.length);
         String manifestFileName = createTempDeploymentFile(fileList,"","manefist",null,client,task);
         System.out.println("manifestFileName : "+manifestFileName);
         task.chooseTransition("done", "Result from External");

    }

    public boolean isDeletedFile(CSClient client,String vpath) throws CSException {
        CSFile file =client.getFile(new CSVPath(vpath));

        return (file.getKind() == CSHole.KIND);
    }

    
    public boolean isExists(CSClient client,String vpath) throws CSException {
    	try{
        CSFile file =client.getFile(new CSVPath(vpath));
        if(file!=null){
        	System.out.println(" file.isReadable():"+file.isReadable());
        	return true;
    	} else {
    		System.out.println(vpath+" doesn't exist.");
        	return false;
    	}
    	}catch(Exception e){
    		System.out.println(vpath+" doesn't staging. can not add in deployment. Error:"+e);
    		return false;
    	}
    }

    public String createTempDeploymentFile(CSAreaRelativePath[] files, String area, String tempFileName,String tmpDir,CSClient client, CSExternalTask task) throws CSAuthorizationException, CSRemoteException, CSObjectNotFoundException, CSExpiredSessionException, CSException{
        String manifestFileName = "";
        String logid = "Test";
        try
        {
                System.out.println(logid +" area : "+area);
                if(area== null || area.equals("")) {
                        System.out.println(logid +" area is blank, search for Staging Area: ");
                        System.out.println(logid +" area : "+area);
                        area=getFullStagingAreaPath(task);
                        System.out.println(logid +" new area : "+area);
                }
                Document manifest = DocumentHelper.createDocument();
                Element root = manifest.addElement("deployment");
                root.addElement("context").addAttribute("area", area);
                Element fileListElement = root.addElement("filelist");

                for (int i = 0; i < files.length; ++i)
                {
                    String fileRelativePath = files[i].toString();
                            String fileFullPath = area + "/" + fileRelativePath;
                            System.out.println(logid + "fileFullPath value: " + fileFullPath);
                            
                            if(isExists(client,fileFullPath))
	                            if(!isDeletedFile(client,fileFullPath)){
	
	                            CSVPath offerFileCSVPath = new CSVPath(fileFullPath);
	                            CSSimpleFile offerFileCSSimpleFile = (CSSimpleFile)client.getFile(offerFileCSVPath);
	
		                            if(offerFileCSSimpleFile != null){
		                                    Element fileElement = fileListElement.addElement("file")
		                                            .addAttribute("areaRelativePath", files[i].toString())
		                                            .addAttribute("otherAttributes", "true");
		                                    fileElement.addElement("attributes");
		                            }
	                            }
                }

                File tempFile = null;
                if(tmpDir!=null && !tmpDir.equals("")){
                    File tempDir = new File(tmpDir);
                    tempFile = File.createTempFile(tempFileName, ".xml", tempDir);
                } else {
                    tempFile = File.createTempFile(tempFileName, ".xml");
                }
                System.out.println( " creating manifest at tempFile : "+tempFile.getPath());
                createXMLFileForDocument(manifest,tempFile);
                manifestFileName = tempFile.getPath();

            }catch(IOException e){
                            System.out.println("Error in workflow task: " + task.getName() + " due to: IOException message, " + e.getMessage());
                            return "IOError";
            }
            return manifestFileName;
        }
        public String getFullStagingAreaPath(CSExternalTask task) throws CSException {
            String path = task.getArea().getVPath().toString();
            path = path.replaceFirst("/WORKAREA/[^/]*", "/STAGING");
            return path;
        }

     public boolean createXMLFileForDocument(Document manifest, File tempFile) throws IOException {

            OutputFormat format = OutputFormat.createPrettyPrint();
                XMLWriter writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream(tempFile), "UTF-8"), format);
            writer.write(manifest);
            writer.close();

            if(tempFile.exists()){
                    return true;
            } else {
                    return false;
            }
        }
    }

                     */   
