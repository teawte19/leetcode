class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int current : asteroids){
            boolean destroyed = false;
            while(!stack.isEmpty() && stack.peek() > 0 && current < 0){
                if(stack.peek() < -current){
                    stack.pop();
                }
                else if (stack.peek() == -current) {
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stack.push(current);
            }
        }
        int[] ans = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
        }

        return ans;
    }
}