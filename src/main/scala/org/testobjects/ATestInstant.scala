package org.testobjects

import java.time.Instant

trait ATestInstant {

  def nonNull: Instant = Instant.EPOCH

  def unique: Instant = Instant.now()

}
