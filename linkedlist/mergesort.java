public static Node<Integer> mergeSortedLL(Node<Integer>firstHead,Node<Integer>secondHead){
	Node<Integer>newHead=null;
		Node<Integer>sorting=null;
		if(firstHead==null)
			return secondHead;
		else
			if(secondHead==null)
				return firstHead;
			else
			{
				if(firstHead.data<=secondHead.data)
					{
					sorting=firstHead;
					firstHead=firstHead.next;
					}
				else
				{
					sorting=secondHead;
					secondHead=secondHead.next;
				}
					newHead=sorting;
					while(firstHead!=null&&secondHead!=null)
					{
						if(firstHead.data<=secondHead.data)
						{
							sorting.next=firstHead;
							sorting=firstHead;
							firstHead=firstHead.next;
						}
						else
						{
							sorting.next=secondHead;
							sorting=secondHead;
							secondHead=secondHead.next;
						}
					}
						if(firstHead==null)
						{
							sorting.next=secondHead;
						}
						else if(secondHead==null)
						{
							sorting.next=firstHead;
								
						}
						return newHead;
						
					
			}
	}