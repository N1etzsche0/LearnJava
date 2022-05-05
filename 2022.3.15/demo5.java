// import java.util.*;
// import java.util.Objects;

// public class demo5 {
// public static void main(String[] args) {
// List<Message> received = List.of(
// new Message(1, "Hello!"),
// new Message(2, "发工资了吗？"),
// new Message(2, "发工资了吗？"),
// new Message(3, "去哪吃饭？"),
// new Message(3, "去哪吃饭？"),
// new Message(4, "Bye"));
// List<Message> displayMessages = process(received);
// for (Message message : displayMessages) {
// System.out.println(message.text);
// }
// }

// static List<Message> process(List<Message> received) {
// Set<Message> messages = new HashSet<Message>();
// for (Message message : received) {
// messages.add(message);
// }
// return new ArrayList<Message>(messages);
// }
// }

// class Message {
// public final int sequence;
// public final String text;

// public Message(int sequence, String text) {
// this.sequence = sequence;
// this.text = text;
// }

// @Override
// public boolean equals(Object o) {
// if (o instanceof Message) {
// Message M = (Message) o;
// return Objects.equals(this.text, M.text) && this.sequence == M.sequence;
// }
// return false;
// }

// @Override
// public int hashCode() {
// return Objects.hash(this.sequence, this.text);
// }
// }
