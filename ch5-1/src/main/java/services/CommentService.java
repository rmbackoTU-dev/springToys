package services;

import org.springframework.stereotype.Service;

@Service
public class CommentService implements SingletonAppService {

	public String serviceID;
	
	public CommentService()
	{
		this.serviceID="ServiceID: "+this.hashCode();
	}
	
	@Override
	public String getServiceID()
	{
		return serviceID;
	}
}
