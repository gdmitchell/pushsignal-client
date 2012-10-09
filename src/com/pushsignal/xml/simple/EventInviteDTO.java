package com.pushsignal.xml.simple;

import java.io.Serializable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="eventInvite", strict=false)
public class EventInviteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element
	private long eventInviteId;

	@Element
	private long createdDateInMilliseconds;

	@Element
	private EventDTO event;

	@Element(required=false)
	private String email;

	@Element(required=false)
	private UserDTO user;

	public void setEventInviteId(final long eventInviteId) {
		this.eventInviteId = eventInviteId;
	}

	public long getEventInviteId() {
		return this.eventInviteId;
	}

	public void setCreatedDateInMilliseconds(final long createdDateInMilliseconds) {
		this.createdDateInMilliseconds = createdDateInMilliseconds;
	}

	public long getCreatedDateInMilliseconds() {
		return createdDateInMilliseconds;
	}

	public EventDTO getEvent() {
		return event;
	}

	public void setEvent(final EventDTO event) {
		this.event = event;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setUser(final UserDTO user) {
		this.user = user;
	}

	public UserDTO getUser() {
		return user;
	}

}
