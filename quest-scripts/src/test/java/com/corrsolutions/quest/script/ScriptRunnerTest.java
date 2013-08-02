/*
 * This file contains proprietary information of Rule Financial.
 * Copying or reproduction without prior written approval is prohibited.
 *
 * <b>Copyright</b> (c) 2012
 * <b>Company</b> Rule Financial
 */

package com.corrsolutions.quest.script;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;



/**
 * Unit tests for the {@link ScriptRunner} class.
 */
public class ScriptRunnerTest {
  private Script script1;
  private Script script2;
  private ScriptRunner scriptRunner;
  
  @Before
  public void initialise() {
    script1 = createScript("script 1", "doing stuff");
    script2 = createScript("script 2", "doing more stuff");
    //final List<Script> scripts = ImmutableList.of(script1, script2);
    //scriptRunner = new ScriptRunner(scripts);
  }
  
  private Script createScript(String name, String description) {
    final Script script = mock(Script.class);
    when(script.getName()).thenReturn(name);
    when(script.getDescription()).thenReturn(description);
    return script;
  }

  @Test
  public void executeAllScriptsInOrder() {
/*    scriptRunner.executeAll();
    
    final InOrder scriptOrder = inOrder(script1, script2);
    scriptOrder.verify(script1).execute();
    scriptOrder.verify(script2).execute();*/
  }
  
  @Test
  public void stopAtError() {
/*    doThrow(new Exception("youch")).when(script1).execute();
    scriptRunner.executeAll();
    verifyZeroInteractions(script2);*/
  }
}
