/*
 * Copyright (c) 2015-2017 Holger de Carne and contributors, All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.carne.certmgr.jfx.certoptions;

import java.io.IOException;

import de.carne.jfx.stage.StageController;
import javafx.scene.control.Dialog;

/**
 * Manage Presets dialog.
 */
public class ManageTemplatesDialog extends Dialog<Void> {

	private ManageTemplatesDialog(ManageTemplatesController controller) {
		setResultConverter(controller);
	}

	/**
	 * Load the Manage Presets dialog.
	 *
	 * @param owner The stage controller owning this dialog.
	 * @return The constructed controller which is bound to the newly created dialog.
	 * @throws IOException if an I/O error occurs during dialog loading.
	 */
	public static ManageTemplatesController load(StageController owner) throws IOException {
		return owner.loadDialog((c) -> new ManageTemplatesDialog(c), ManageTemplatesController.class);
	}

}