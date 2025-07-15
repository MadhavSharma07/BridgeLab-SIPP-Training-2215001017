package scenerioproblem;

public class BrowserHistoryNavigation {
	   class History{
		String historyName;
		int historyId;
		String userName ;
		History prev;
		History next;
		History(String historyName,int historyId,String userName){
			this.historyName=historyName;
			this.historyId=historyId;
			this.userName = userName;
			this.prev=null;
			this.next=null;
			
		}
	   }
	   class User{
		History head = null;
		History tail = null;
		
		public  void addHistory(String historyName,int historyId,String userName) {
			History newNode = new History(historyName,historyId,userName);
			if(head==null) {
				head = newNode;
				tail = newNode;
				
			}
			else {
				newNode.next = head.prev;
				head.prev=newNode;
				head = newNode;
			}
		}
		 public void searchForward(String historyName, int historyId) {
		        History current = head;
		        while (current != null) {
		            if (current.historyName.equals(historyName) && current.historyId == historyId) {
		                System.out.println("Found in forward search: " + historyName);
		                return;
		            }
		            current = current.next;
		        }
		        System.out.println("Not found in forward search.");
		    }

		    public void searchBackward(String historyName, int historyId) {
		        History current = tail;
		        while (current != null) {
		            if (current.historyName.equals(historyName) && current.historyId == historyId) {
		                System.out.println("Found in backward search: " + historyName);
		                return;
		            }
		            current = current.prev;
		        }
		        System.out.println("Not found in backward search.");
		    }

		
	   }

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
