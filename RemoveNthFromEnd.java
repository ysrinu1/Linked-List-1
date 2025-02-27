
class RemoveNthFromEnd {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
		            if(head==null)
				                return null;
			            ListNode dummy = new ListNode(-1);
				            dummy.next=head;
					            ListNode slow=dummy,fast=dummy;
						            int count=0;
							            while(count<=n){
									                fast=fast.next;
											            count++;
												            }
								            while(fast!=null){
										                fast=fast.next;
												            slow=slow.next;
													            }
									            slow.next=slow.next.next;
										            return dummy.next;
											        }
}
