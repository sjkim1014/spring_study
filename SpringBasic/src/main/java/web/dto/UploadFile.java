package web.dto;

import java.util.Date;

public class UploadFile {

	private int file_no;
	private String origin_name;
	private String stored_name;
	private long file_size;
	private Date upload_date;
	
	@Override
	public String toString() {
		return "Uploadfile [file_no=" + file_no + ", origin_name=" + origin_name + ", stored_name=" + stored_name
				+ ", file_size=" + file_size + ", upload_date=" + upload_date + "]";
	}
	
	public int getFile_no() {
		return file_no;
	}
	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}
	public String getOrigin_name() {
		return origin_name;
	}
	public void setOrigin_name(String origin_name) {
		this.origin_name = origin_name;
	}
	public String getStored_name() {
		return stored_name;
	}
	public void setStored_name(String stored_name) {
		this.stored_name = stored_name;
	}
	public long getFile_size() {
		return file_size;
	}
	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}
	public Date getUpload_date() {
		return upload_date;
	}
	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}
}
