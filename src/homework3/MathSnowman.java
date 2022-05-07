package homework3;

public class MathSnowman {
    public static void main(String[] args) {
        float ball_1 = 1;
        float ball_2 = 0.5f;
        float ball_3 = 0.3f;
        float density = 0.7f;

        float weight_ball_1 = ball_1 * density;
        float weight_ball_2 = ball_2 * density;
        float weight_ball_3 = ball_3 * density;

        float weight_all_ball = weight_ball_1 + weight_ball_2 + weight_ball_3;

        System.out.println("Сніговик важить: " + weight_all_ball);
    }
}
