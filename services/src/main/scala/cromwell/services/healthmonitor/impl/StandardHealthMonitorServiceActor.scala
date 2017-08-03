package cromwell.services.healthmonitor.impl

import com.typesafe.config.Config
import cromwell.services.healthmonitor.HealthMonitorServiceActor
import cromwell.services.healthmonitor.HealthMonitorServiceActor.Subsystem

/*
  Checks:
  DB
  Dockerhub (if exists)
*/
class StandardHealthMonitorServiceActor(serviceConfig: Config, globalConfig: Config) extends HealthMonitorServiceActor {
  override lazy val subsystems: List[Subsystem] = List.empty[Subsystem] // FIXME
}
