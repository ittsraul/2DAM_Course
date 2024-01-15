// default package
// Generated 26 nov 2023 19:40:10 by Hibernate Tools 5.2.13.Final
package enginerinversed.entities;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "User", catalog = "kurigram")
public class User implements java.io.Serializable {

	private Long id;
	private String email;
	private String name;
	private String password;
	private Integer phone;
	private Set<UserFollow> userFollows = new HashSet<UserFollow>(0);
	private Set<Conversation> conversations = new HashSet<Conversation>(0);
	private Set<Message> messagesForIduser = new HashSet<Message>(0);
	private Set<Message> messagesForSenderIduser = new HashSet<Message>(0);
	private Set<Participant> participants = new HashSet<Participant>(0);
	private Set<Profile> profiles = new HashSet<Profile>(0);
	private Set<Post> posts = new HashSet<Post>(0);
	private Set<Event> events = new HashSet<Event>(0);

	public User() {
	}

	public User(String password) {
		this.password = password;
	}

	public User(String email, String name, String password, Integer phone, Set<UserFollow> userFollows,
			Set<Conversation> conversations, Set<Message> messagesForIduser, Set<Message> messagesForSenderIduser,
			Set<Participant> participants, Set<Profile> profiles, Set<Post> posts, Set<Event> events) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.userFollows = userFollows;
		this.conversations = conversations;
		this.messagesForIduser = messagesForIduser;
		this.messagesForSenderIduser = messagesForSenderIduser;
		this.participants = participants;
		this.profiles = profiles;
		this.posts = posts;
		this.events = events;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "phone")
	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserFollow> getUserFollows() {
		return this.userFollows;
	}

	public void setUserFollows(Set<UserFollow> userFollows) {
		this.userFollows = userFollows;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "conversation_user", catalog = "kurigram", joinColumns = {
			@JoinColumn(name = "user_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "conversation_id", nullable = false, updatable = false) })
	public Set<Conversation> getConversations() {
		return this.conversations;
	}

	public void setConversations(Set<Conversation> conversations) {
		this.conversations = conversations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByIduser")
	public Set<Message> getMessagesForIduser() {
		return this.messagesForIduser;
	}

	public void setMessagesForIduser(Set<Message> messagesForIduser) {
		this.messagesForIduser = messagesForIduser;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userBySenderIduser")
	public Set<Message> getMessagesForSenderIduser() {
		return this.messagesForSenderIduser;
	}

	public void setMessagesForSenderIduser(Set<Message> messagesForSenderIduser) {
		this.messagesForSenderIduser = messagesForSenderIduser;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Participant> getParticipants() {
		return this.participants;
	}

	public void setParticipants(Set<Participant> participants) {
		this.participants = participants;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "User_Event", catalog = "kurigram", joinColumns = {
			@JoinColumn(name = "user_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "event_id", nullable = false, updatable = false) })
	public Set<Event> getEvents() {
		return this.events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

}