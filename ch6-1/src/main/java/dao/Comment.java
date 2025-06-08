package dao;

public class Comment {
	
	private String author;
	private String text;
	
	public Comment()
	{
		this.author="";
		this.text="";
	}
	
	/**
	 * Copy Constructor
	 * @param comment
	 */
	public Comment(Comment comment)
	{
		this.author=comment.getAuthor();
		this.text=comment.getText();
	}
	
	/**
	 * Setter
	 * @param authorString
	 */
	public void setAuthor(String authorString)
	{
		this.author=authorString;
	}
	
	/**
	 * Setter
	 * @param commentString
	 */
	public void setText(String commentString)
	{
		this.text=commentString;
	}
	
	/**
	 * Getter
	 * @return Author member
	 */
	public String getAuthor()
	{
		return this.author;
	}
	
	/**
	 * Getter
	 * @return text member
	 */
	public String getText()
	{
		return this.text;
	}
	
	/*
	 * Formatted comment message in author colon message format
	 */
	@Override
	public String toString()
	{
		String out=this.author+": "+this.text;
		return out;
	}
}
