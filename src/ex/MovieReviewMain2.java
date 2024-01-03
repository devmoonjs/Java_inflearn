package ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        MovieReview[] reviews = new MovieReview[2];

        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        for(MovieReview review : reviews) {
            System.out.println("영화 제목 : " + review.title + " 영화 리뷰 : " + review.review);
        }

//        System.out.println("영화 제목 : " + inception.title + " 영화 리뷰 : " + inception.review);
//        System.out.println("영화 제목 : " + aboutTime.title + " 영화 리뷰 : " + aboutTime.review);

    }
}



