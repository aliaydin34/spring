package spring2;

public class SuccessDataResult<T> extends dataresultsucces<T> {

	public SuccessDataResult(String message, int page, int mn, T data,Entittyy enty) {
		super(message, page, mn, data,enty);
	}
	public SuccessDataResult(T data,String message) {
		super(data,message);
	}
	public SuccessDataResult(String message,String strx) {
		super(message,strx);
		
	}
	public SuccessDataResult(int page) {
		super(null,null,page);
	}
	public SuccessDataResult(Entittyy ent) {
		super(null,ent);
	}
	

}
