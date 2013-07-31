/*
 * This file contains proprietary information of Rule Financial.
 * Copying or reproduction without prior written approval is prohibited.
 *
 * <b>Copyright</b> (c) 2013
 * <b>Company</b> Corr Solutions
 */

package com.corrsolutions.quest.script;

/**
 * A script to be executed by the {@link ScriptRunner}.
 */
public interface Script {
  String getName();
  String getDescription();

  /**
   * Executes the script.
   */
  void execute();
}
