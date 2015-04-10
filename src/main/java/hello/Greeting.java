package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {

	private long id;
	private String content;

//	public Greeting(long id, String content) {
//		this.id = id;
//		this.content = content;
//	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
