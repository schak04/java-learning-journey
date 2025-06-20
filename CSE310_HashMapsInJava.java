/* search using key */

// import java.util.HashMap;

// public class CSE310_HashMapsInJava {
//     public static void main(String[] args) {
//         HashMap<String,String> contacts = new HashMap<>();
//         contacts.put("ABC", "+91-ZZZZZZZZZZ");
//         contacts.put("ABC", "+91-YYYYYYYYYY");
//         String search = "ABC";
//         if (contacts.containsKey(search)) {
//             System.out.println("Found: "+search+" -> " + contacts.get(search));
//         } else {
//             System.out.println("Contact not found!");
//         }
//     }
// }

/* search using value */

// import java.util.HashMap;
// import java.util.Map;

// public class CSE310_HashMapsInJava {
//     public static void main(String[] args) {
//         HashMap<String, String> contacts = new HashMap<>();
//         contacts.put("ABC", "+91-ZZZZZZZZZZ");
//         contacts.put("ABC", "91-YYYYYYYYYY"); // overwrites previous value

//         String valueToSearch = "91-YYYYYYYYYY";
//         boolean found = false;

//         for (Map.Entry<String, String> entry : contacts.entrySet()) {
//             if (entry.getValue().equals(valueToSearch)) {
//                 System.out.println("Found: " + entry.getKey() + " -> " + entry.getValue());
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("Value not found!");
//         }
//     }
// }