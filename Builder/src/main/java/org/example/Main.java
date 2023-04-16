package org.example;

class NutritionFacts{
    int servingSize;
    int servings;
    int calories;
    int fat;
    int sodium;
    int carbohydrate;

    public static class Builder{
        // Required parameters(필수 인자)
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values(선택적 인자는 기본값으로 초기화)
        private int calories      = 0;
        private int fat           = 0;
        private int carbohydrate  = 0;
        private int sodium        = 0;

        public Builder(int servingSize, int servings) { //생성자로 필수인자의 값을 넣는다.
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;    // 이렇게 하면 . 으로 체인을 이어갈 수 있다.
        }
        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }
        public Builder sodium(int val) {
            sodium = val;
            return this;
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}

public class Main {
    public static void main(String[] args) {NutritionFacts cocaCola = new NutritionFacts
            .Builder(240, 8)    // 필수값 입력
            .calories(100)
            .sodium(35)
            .carbohydrate(27)
            .build();           // build() 가 객체를 생성해 돌려준다.
    }


}
