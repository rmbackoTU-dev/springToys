package services;

public class CommentService implements AppService {
	
	public String serviceID;
	
	public CommentService()
	{
		this.serviceID="ServiceID: "+this.hashCode();
	}
	
	@Override
	public String getServiceID()
	{
		return this.serviceID;
	}

}
