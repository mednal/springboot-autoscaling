package com.testmessagequeue.springrabbit.config;

import io.prometheus.client.Gauge;

public class QueueMetrics {
    private static final Gauge queueMessages = Gauge.build()
            .name("queue_messages")
            .help("Number of messages in the queue")
            .register();

    public static void setQueueMessages(int numMessages) {
        queueMessages.set(numMessages);
    }
}
