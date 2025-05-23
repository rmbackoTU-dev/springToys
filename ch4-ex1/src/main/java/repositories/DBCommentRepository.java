package repositories;


import dao.Comment;

public class DBCommentRepository implements CommentRepository{

	/**
	 * Stores a comment in the database
	 * in mock example only prints
	 */
	@Override
	public void storeComment(Comment comment)
	{
		System.out.println("Storing Comment: "+comment);
	}
}
