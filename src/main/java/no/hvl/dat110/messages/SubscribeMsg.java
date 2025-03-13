package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic
	
	private String topic;
	
    public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic;
    }

    public String getUser() {
    	return super.getUser();
    }
    
    public MessageType getType() {
    	return super.getType();
    }
    
	public String getTopic() {
		return topic;
	}
	
    public void setTopic(String topic) {
    	this.topic = topic;
    }
	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
    @Override
	public String toString() {
		return "CreateTopicMsg [topic=" + topic + ", user=" + getUser() + "]";
	}
    
}
