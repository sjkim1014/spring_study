package web.dto;

public class ResultData {

	private String data1;
	@Override
	public String toString() {
		return "ResultData [data1=" + data1 + ", data2=" + data2 + "]";
	}
	private int data2;
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public int getData2() {
		return data2;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	
}
