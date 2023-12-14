package YandexAlgoritm4.WarmUp.F;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        Stack<myPair> stack = new Stack<>();
        int result = 0;
        for(int i = 1; i <= n; i++){
            int a = scanner.nextInt();
            if(a == k){
                result += 2 * i;
            }else if(a > k){
                result += (a / k) * i * 2;
                stack.push(new myPair(i, a%k));
                if(stack.peek().getPeople() == 0)stack.pop();
            }else {
                if(a != 0) stack.push(new myPair(i,a));
            }

        }

        while (!stack.empty()){

            myPair myPair = stack.pop();
            int curPeopleInElevator = myPair.people;
            result += myPair.level * 2;


            while(curPeopleInElevator < k && !stack.empty()){
                myPair = stack.peek();
                if(myPair.people <= k - curPeopleInElevator){
                    curPeopleInElevator += myPair.people;
                    stack.pop();
                }else{
                    int addPeople = k - curPeopleInElevator;
                    myPair.setPeople(myPair.people - addPeople);
                    if (myPair.people == 0) stack.pop();
                    curPeopleInElevator += addPeople;
                }
            }
        }
        System.out.println(result);

    }

    static class myPair{
        int level;
        int people;

        public myPair(int level, int people) {
            this.level = level;
            this.people = people;
        }

        public myPair() {
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getPeople() {
            return people;
        }

        public void setPeople(int people) {
            this.people = people;
        }
    }
}
