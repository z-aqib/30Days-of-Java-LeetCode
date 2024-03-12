class Solution {
    public int maxProfit(int[] prices) {
        int min_value = prices[0];
        int max_value = 0;
        int index_min_value = 0;
        int index_max_value = -1;
        int second_min_value = 0;
        int second_min_value_index = -1;
        int second_max_value = 0;
        int second_max_value_index = -1;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min_value && (index_max_value == -1 || i < index_max_value)){
                min_value = prices[i];
                index_min_value = i;
            } else if (prices[i] < min_value && (second_min_value_index == -1 || prices[i] < second_min_value)) {
                second_min_value = prices[i];
                second_min_value_index = i;
            } else if (prices[i] > min_value && index_min_value < i && prices[i] >= max_value) {
                max_value = prices[i];
                index_max_value = i;
            } else if (prices[i] > second_max_value && (second_max_value_index == -1 
                    ||  i > second_min_value_index)&& second_min_value_index != -1) {
                second_max_value = prices[i];
                second_max_value_index = i;
            }
            if (second_min_value_index > index_min_value && second_min_value_index < index_max_value){
                min_value = second_min_value;
                index_min_value = second_min_value_index;
            }
        }
        int profitMin = 0;
        int profitSecond = 0;
        int profitSec = 0;
        if (second_min_value_index < index_max_value && second_min_value_index != -1) {
            profitSecond =  max_value - second_min_value;
        }
        if (min_value < max_value){
            profitMin =  max_value - min_value;
        }
        if (second_min_value_index != -1 && second_max_value_index != -1) {
            profitSec = second_max_value - second_min_value;
        }
        return Math.max(profitMin, Math.max(profitSecond, profitSec));
    }
}