package repositories;

import dao.Comment;

public interface CommentRepository {
	
	/**
	 * Implement an interface to store a comment in I/O
	 * must take in Comment Object
	 */
	public void storeComment(Comment comment);

}
