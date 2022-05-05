//import java.util.*;
//
//public class demo2 {
//    public static void main() {
//        ThreadLocalWithUserContext firstUser = new ThreadLocalWithUserContext(1);
//        ThreadLocalWithUserContext secondUser = new ThreadLocalWithUserContext(2);
//        new Thread(firstUser).start();
//        new Thread(secondUser).start();
//    }
//
//}
//
//class ThreadLocalWithUserContext implements Runnable {
//
//    private static ThreadLocal<Context> userContext = new ThreadLocal<>();
//    private Integer userId;
//    private UserRepository userRepository = new UserRepository();
//
//    public ThreadLocalWithUserContext(int i) {
//        this.userId = i;
//    }
//
//    @Override
//    public void run() {
//        String userName = userRepository.getUserNameForUserId(userId);
//        userContext.set(new Context(userName));
//        System.out.println("thread context for given userId: "
//                + userId + " is: " + userContext.get());
//    }
