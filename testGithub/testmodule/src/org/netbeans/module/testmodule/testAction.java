/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.module.testmodule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
	category = "tools",
	id = "org.netbeans.module.testmodule.testAction"
)
@ActionRegistration(
	displayName = "#CTL_testAction"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_testAction=test2")
public final class testAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO implement action body
	}
}
