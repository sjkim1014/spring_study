package web.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import web.dao.face.FileDao;
import web.dto.Uploadfile;

@Controller
public class FileController {

	@Autowired ServletContext context;
	@Autowired FileDao fileDao;
	
	private static final Logger logger = LoggerFactory.getLogger(InterceptorAdmintController.class);

	@RequestMapping (value="/file/fileup", method=RequestMethod.GET)
	public void fileForm() {
		
	}
	
	@RequestMapping (value="/file/fileup", method=RequestMethod.POST)
	public String fileuplaod(
			MultipartFile file, 
			Uploadfile upFile 
			//ServletContext context
			) {
		
		logger.info("파일업로드!");
		
		// 고유 식별자 
		String uId = UUID.randomUUID().toString().split("-")[0];

		// 저장될 파일이름 
		String stored_name = null;
		stored_name = file.getOriginalFilename() + "_" + uId;
		
		// 파일 저장경로 
		String path = context.getRealPath("upload");
		
		// 저장될 파일 
		File dest = new File(path, stored_name);
		
		try {
			file.transferTo(dest);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		upFile.setOrigin_name(file.getOriginalFilename());
		upFile.setFile_size(file.getSize());
		upFile.setStored_name(stored_name);
		
		logger.info(upFile.toString());

		fileDao.insert(upFile);
		
		return null;
	}
}
