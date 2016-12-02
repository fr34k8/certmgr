/*
 * Copyright (c) 2015-2016 Holger de Carne and contributors, All Rights Reserved.
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
package de.carne.certmgr.jfx.crloptions;

import de.carne.certmgr.certs.UserCertStore;
import de.carne.certmgr.certs.UserCertStoreEntry;
import de.carne.certmgr.certs.security.SignatureAlgorithm;
import de.carne.certmgr.certs.x509.ReasonFlag;
import de.carne.jfx.stage.StageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 */
public class CRLOptionsController extends StageController {

	@FXML
	TextField ctlIssuerField;

	@FXML
	ComboBox<SignatureAlgorithm> ctlSigAlgOption;

	@FXML
	DatePicker ctlLastUpdateInput;

	@FXML
	DatePicker ctlNextUpdateInput;

	@FXML
	TableView<EntryModel> ctlEntryOptions;

	@FXML
	TableColumn<EntryModel, Boolean> ctlEntryOptionRevoked;

	@FXML
	TableColumn<EntryModel, String> ctlEntryOptionDN;

	@FXML
	TableColumn<EntryModel, ReasonFlag> ctlEntryOptionReason;

	@FXML
	void onCmdGenerate(ActionEvent evt) {

	}

	@FXML
	void onCmdCancel(ActionEvent evt) {
		close(false);
	}

	@Override
	protected void setupStage(Stage stage) {
		stage.setTitle(CRLOptionsI18N.formatSTR_STAGE_TITLE());
	}

	public CRLOptionsController init(UserCertStore store, UserCertStoreEntry entry) {
		return this;
	}

}
