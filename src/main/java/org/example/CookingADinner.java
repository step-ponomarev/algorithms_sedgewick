package org.example;

import java.util.Arrays;

// https://stepik.org/lesson/864357/step/1?unit=868440
public final class CookingADinner {
    private static class Dish {
        public final int cookTime;
        public final int freshTime;

        public Dish(int cookTime, int freshTime) {
            this.cookTime = cookTime;
            this.freshTime = freshTime;
        }
    }

    public static void main(String[] args) {
        System.out.println(
                canICook(new Dish[]{new Dish(10, 1), new Dish(1, 10), new Dish(1, 1)})
                        ? "Yes"
                        : "No"
        );
    }

    private static boolean canICook(Dish[] dishes) {
        if (dishes.length <= 1) {
            return true;
        }

        Arrays.sort(dishes, (l, r) -> (r.cookTime + r.freshTime) - (l.cookTime + l.freshTime));
        
        int sumCookTime = dishes[dishes.length - 1].cookTime;
        for (int i = dishes.length - 2; i >= 0; i--) {
            if (dishes[i].freshTime < sumCookTime) {
                return false;
            }

            sumCookTime += dishes[i].cookTime;
        }


        return true;
    }
}
