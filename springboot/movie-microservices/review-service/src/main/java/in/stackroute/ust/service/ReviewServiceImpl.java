package in.stackroute.ust.service;

import in.stackroute.ust.domain.Review;
import in.stackroute.ust.repository.ReviewRepository;
import in.stackroute.ust.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getReviewByMovieId(int id) {
        return reviewRepository.findByMovieId(id);
    }

    @Override
    public List<Review> getReviewByReviewer(String reviewer) {
        return reviewRepository.findReviewByReviewer(reviewer);
    }
}
