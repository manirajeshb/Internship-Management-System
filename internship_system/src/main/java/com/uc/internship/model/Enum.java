package com.uncc.internship.model;

import java.io.Serializable;

public class Enum implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * `enumId` int NOT NULL, `content` VARCHAR(100) NOT NULL,
	 */
	private Integer enumId;

	public Integer getEnumId() {
		return enumId;
	}

	public void setEnumId(Integer enumId) {
		this.enumId = enumId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private String content;
}
