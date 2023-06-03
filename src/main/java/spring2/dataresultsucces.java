package spring2;

public class dataresultsucces<T> extends ResultData {
	private int page;
	private int mn;
	private T data;
	private String strx;
	private Entittyy enty;
	public dataresultsucces(String message, int page, int mn, T data,Entittyy enty) {
		super(message);
		this.page = page;
		this.mn = mn;
		this.data = data;
		this.enty=enty;
	}
	public dataresultsucces(String message,T data,int page) {
		super(message);
		this.data=data;
		this.page=page;
	
	}
	public dataresultsucces(T data,String message) {
		super(message);
		this.data=data;
		
	}
	public dataresultsucces(String message) {
		super(message);
		
	}
	public dataresultsucces(String message,String strx) {
		super(message);
		this.strx=strx;
	}
	public dataresultsucces(int page,String message) {
		super(message);
		this.page=page;
	}
	public dataresultsucces(String message, Entittyy enty) {
		super(message);
		this.enty = enty;
	}
	public Entittyy getEnty() {
		return enty;
	}
	
	public int getPage() {
		return page;
	}
	
	public int getMn() {
		return mn;
	}
	
	public T getData() {
		return data;
	}
	public String getStrx() {
		return strx;
	}
	
	
	
	

}
