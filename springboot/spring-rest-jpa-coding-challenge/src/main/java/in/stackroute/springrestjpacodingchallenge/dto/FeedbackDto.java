package in.stackroute.springrestjpacodingchallenge.dto;

import in.stackroute.springrestjpacodingchallenge.domain.Product;
import in.stackroute.springrestjpacodingchallenge.domain.User;

public record FeedbackDto(int feedbackId, String comment, Product product, User user) {}
