package org.odata4j.producer.jdbc.commandproducer;

import org.odata4j.core.OEntityId;

public interface CreateLinkCommandContext extends ProducerCommandContext<Void> {

  OEntityId getSourceEntity();

  String getTargetNavProp();

  OEntityId getTargetEntity();

}
