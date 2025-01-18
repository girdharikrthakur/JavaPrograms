// Enum for predefined branches
public enum Branch {
 BE, BTECH, BCA, MCA, CS;

 // Method to check if a branch is valid
 public static boolean isValidBranch(String branch) {
  for (Branch c : Branch.values()) {
   if (c.name().equalsIgnoreCase(branch)) {
    return true;
   }
  }
  return false;
 }
}