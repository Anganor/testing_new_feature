package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        // Given / Arrange
        User arthur = new Millenials("Arthur Knight");
        User brajan = new YGeneration("Brajan Saint");
        User jessica = new ZGeneration("Jessica Jones");

        // When / Act
        String arthurPosted = arthur.sharePost();
        System.out.println("Arthur posted: " + arthurPosted);
        String brajanTwitted = brajan.sharePost();
        System.out.println("Brajan twitted: " + brajanTwitted);
        String jessicaShared = jessica.sharePost();
        System.out.println("Jessica shared: " + jessicaShared);

        // Then / Assert
        Assert.assertEquals("[FacebookPublisher] Share if you can, let them know.", arthurPosted);
        Assert.assertEquals("[TwitterPublisher] Twitting some positive vibes!", brajanTwitted);
        Assert.assertEquals("[SnapchatPublisher] Just see what happened to me today...", jessicaShared);
    }

    @Test
    public void testIndividualSharingStrategy() {
        // Given / Arrange
        User arthur = new Millenials("Artur Knight");

        // When / Act
        String arthurPosted = arthur.sharePost();
        System.out.println("Arthur posted: " + arthurPosted);
        arthur.setSocialPublisher(new TwitterPublisher());
        arthurPosted = arthur.sharePost();
        System.out.println("Arthur twitted: " + arthurPosted);

        // Then / Assert
        Assert.assertEquals("[TwitterPublisher] Twitting some positive vibes!", arthurPosted);
    }
}
