
package com.ss.lms.entity;

public class Author {
	
	private Integer authorId;
	private String authorName;
	
	public Author(){
		
	}
	
	public Author(Integer authorId, String authorName) {
		this.authorId = authorId;
		this.authorName = authorName;
	}
	
	@Override
	public String toString() 
	{
		return authorId + "\t" + authorName;
	}

	/**
	 * @return the authorId
	 */
	public Integer getAuthorId() {
		return authorId;
	}

	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	
}