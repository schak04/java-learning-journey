/* search using key */

// import java.util.HashMap;

// public class CSE310_HashMapsInJava {
//     public static void main(String[] args) {
//         HashMap<String,String> contacts = new HashMap<>();
//         contacts.put("Sapto", "+69-6969696969");
//         contacts.put("Sapto", "+\\/-PraiseTheSun");
//         String search = "Sapto";
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
//         contacts.put("Sapto", "+69-6969696969");
//         contacts.put("Sapto", "+\\/-PraiseTheSun"); // overwrites previous value

//         String valueToSearch = "+\\/-PraiseTheSun";
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