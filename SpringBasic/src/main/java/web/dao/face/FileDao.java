package web.dao.face;

import web.dto.Uploadfile;

public interface FileDao {

	// 파일 업로드 기록 저장
	public void insert (Uploadfile upFile);
	
}
