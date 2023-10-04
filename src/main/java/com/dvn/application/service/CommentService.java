package com.dvn.application.service;

import com.dvn.application.entity.Comment;
import com.dvn.application.model.request.CreateCommentPostRequest;
import com.dvn.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
