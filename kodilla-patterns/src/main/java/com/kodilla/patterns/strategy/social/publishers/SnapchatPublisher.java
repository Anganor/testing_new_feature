package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[SnapchatPublisher] Just see what happened to me today...";
    }
}
