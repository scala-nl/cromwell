package cromwell.services.healthmonitor.impl

import cromwell.services.healthmonitor.HealthMonitorServiceActor
import cromwell.services.healthmonitor.HealthMonitorServiceActor.Subsystem

/*
  Checks:
  DB
  Dockerhub (if exists)
*/

class StandardHealthMonitorServiceActor extends HealthMonitorServiceActor {
  println("HI I AM HERE")
  override val subsystems: List[Subsystem] = List.empty[Subsystem]
}

