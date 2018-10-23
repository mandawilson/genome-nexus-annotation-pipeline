/*
 * Copyright (c) 2016 Memorial Sloan-Kettering Cancer Center.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF MERCHANTABILITY OR FITNESS
 * FOR A PARTICULAR PURPOSE. The software and documentation provided hereunder
 * is on an "as is" basis, and Memorial Sloan-Kettering Cancer Center has no
 * obligations to provide maintenance, support, updates, enhancements or
 * modifications. In no event shall Memorial Sloan-Kettering Cancer Center be
 * liable to any party for direct, indirect, special, incidental or
 * consequential damages, including lost profits, arising out of the use of this
 * software and its documentation, even if Memorial Sloan-Kettering Cancer
 * Center has been advised of the possibility of such damage.
 */

/*
 * This file is part of cBioPortal CMO-Pipelines.
 *
 * cBioPortal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.cbioportal.models;

import java.util.*;
import org.springframework.util.StringUtils;

/**
 *
 * @author Zachary Heins
 */
public class MutationRecord {
    protected String hugoSymbol;
    protected String entrezGeneId;
    protected String center;
    protected String ncbiBuild;
    protected String chromosome;
    protected String startPosition;
    protected String endPosition;
    protected String strand;
    protected String variantClassification;
    protected String variantType;
    protected String referenceAllele;
    protected String tumorSeqAllele1;
    protected String tumorSeqAllele2;
    protected String dbSnpRs;
    protected String dbSnpValStatus;
    protected String tumorSampleBarcode;
    protected String matchedNormSampleBarcode;
    protected String matchedNormSeqAllele1;
    protected String matchedNormSeqAllele2;
    protected String tumorValidationAllele1;
    protected String tumorValidationAllele2;
    protected String matchNormValidationAllele1;
    protected String matchNormValidationAllele2;
    protected String verificationStatus;
    protected String validationStatus;
    protected String mutationStatus;
    protected String sequencingPhase;
    protected String sequencingSource;
    protected String validationMethod;
    protected String score;
    protected String bamFile;
    protected String sequencer;
    protected String tumorSampleUUID;
    protected String matchedNormSampleUUID;
    protected String tRefCount;
    protected String tAltCount;
    protected String nRefCount;
    protected String nAltCount;
    protected String dipLogR;
    protected String cellularFraction;
    protected String totalCopyNumber;
    protected String minorCopyNumber;
    protected String cellularFractionEm;
    protected String totalCopyNumberEm;
    protected String minorCopyNumberEm;
    protected String purity;
    protected String ploidy;
    protected String ccfMCopies;
    protected String ccfMCopiesLower;
    protected String ccfMCopiesUpper;
    protected String ccfMCopiesProb95;
    protected String ccfMCopiesProb90;
    protected String ccfMCopiesEm;
    protected String ccfMCopiesLowerEm;
    protected String ccfMCopiesUpperEm;
    protected String ccfMCopiesProb95Em;
    protected String ccfMCopiesProb90Em;

    protected Map<String, String> additionalProperties = new LinkedHashMap<>();
    protected List<String> header = new ArrayList<>();

    public MutationRecord() {
        initHeader();
    }

    public MutationRecord(String hugoSymbol, String entrezGeneId, String center, String ncbiBuild,
            String chromosome, String startPosition, String endPosition, String strand, String variantClassification,
            String variantType, String referenceAllele, String tumorSeqAllele1, String tumorSeqAllele2, String dbSnpRs,
            String dbSnpValStatus, String tumorSampleBarcode, String matchedNormSampleBarcode,
            String matchedNormSeqAllele1, String matchedNormSeqAllele2, String tumorValidationAllele1,
            String tumorValidationAllele2, String matchNormValidationAllele1, String matchNormValidationAllele2,
            String verificationStatus, String validationStatus, String mutationStatus, String sequencingPhase,
            String sequencingSource, String validationMethod, String score, String bamFile, String sequencer,
            String tumorSampleUUID, String matchedNormSampleUUID, String tRefCount, String tAltCount,
            String nRefCount, String nAltCount, String dipLogR, String cellularFraction, String totalCopyNumber,
            String minorCopyNumber, String cellularFractionEm, String totalCopyNumberEm, String minorCopyNumberEm,
            String purity, String ploidy, String ccfMCopies, String ccfMCopiesLower, String ccfMCopiesUpper,
            String ccfMCopiesProb95, String ccfMCopiesProb90, String ccfMCopiesEm, String ccfMCopiesLowerEm,
            String ccfMCopiesUpperEm, String ccfMCopiesProb95Em, String ccfMCopiesProb90Em, Map<String, String> additionalProperties) {

        this.hugoSymbol = hugoSymbol;
        this.entrezGeneId = entrezGeneId;
        this.center = center;
        this.ncbiBuild = ncbiBuild;
        this.chromosome = chromosome;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.strand = strand;
        this.variantClassification = variantClassification;
        this.variantType = variantType;
        this.referenceAllele = referenceAllele;
        this.tumorSeqAllele1 = tumorSeqAllele1;
        this.tumorSeqAllele2 = tumorSeqAllele2;
        this.dbSnpRs = dbSnpRs;
        this.dbSnpValStatus = dbSnpValStatus;
        this.tumorSampleBarcode = tumorSampleBarcode;
        this.matchedNormSampleBarcode = matchedNormSampleBarcode;
        this.matchedNormSeqAllele1 = matchedNormSeqAllele1;
        this.matchedNormSeqAllele2 = matchedNormSeqAllele2;
        this.tumorValidationAllele1 = tumorValidationAllele1;
        this.tumorValidationAllele2 = tumorValidationAllele2;
        this.matchNormValidationAllele1 = matchNormValidationAllele1;
        this.matchNormValidationAllele2 = matchNormValidationAllele2;
        this.verificationStatus = verificationStatus;
        this.validationStatus = validationStatus;
        this.mutationStatus = mutationStatus;
        this.sequencingPhase = sequencingPhase;
        this.sequencingSource = sequencingSource;
        this.validationMethod = validationMethod;
        this.score = score;
        this.bamFile = bamFile;
        this.sequencer = sequencer;
        this.tumorSampleUUID = tumorSampleUUID;
        this.matchedNormSampleUUID = matchedNormSampleUUID;
        this.tRefCount = tRefCount;
        this.tAltCount = tAltCount;
        this.nRefCount = nRefCount;
        this.nAltCount = nAltCount;
        this.dipLogR = dipLogR;
        this.cellularFraction = cellularFraction;
        this.totalCopyNumber = totalCopyNumber;
        this.minorCopyNumber = minorCopyNumber;
        this.cellularFractionEm = cellularFractionEm;
        this.totalCopyNumberEm = totalCopyNumberEm;
        this.minorCopyNumberEm = minorCopyNumberEm;
        this.purity = purity;
        this.ploidy = ploidy;
        this.ccfMCopies = ccfMCopies;
        this.ccfMCopiesLower = ccfMCopiesLower;
        this.ccfMCopiesUpper = ccfMCopiesUpper;
        this.ccfMCopiesProb95 = ccfMCopiesProb95;
        this.ccfMCopiesProb90 = ccfMCopiesProb90;
        this.ccfMCopiesEm = ccfMCopiesEm;
        this.ccfMCopiesLowerEm = ccfMCopiesLowerEm;
        this.ccfMCopiesUpperEm = ccfMCopiesUpperEm;
        this.ccfMCopiesProb95Em = ccfMCopiesProb95Em;
        this.ccfMCopiesProb90Em = ccfMCopiesProb90Em;
        this.additionalProperties = additionalProperties;
        initHeader();
    }

    public String getHUGO_SYMBOL() {
        return this.hugoSymbol == null ? "" : this.hugoSymbol;
    }

    public void setHUGO_SYMBOL(String hugoSymbol) {
        this.hugoSymbol = hugoSymbol;
    }

    public String getENTREZ_GENE_ID() {
        return this.entrezGeneId == null ? "" : this.entrezGeneId;
    }

    public void setENTREZ_GENE_ID(String entrezGeneId) {
        this.entrezGeneId = entrezGeneId;
    }

    public String getCENTER() {
        return this.center == null ? "" : this.center;
    }

    public void setCENTER(String center) {
        this.center = center;
    }

    public String getNCBI_BUILD() {
        return this.ncbiBuild == null ? "" : this.ncbiBuild;
    }

    public void setNCBI_BUILD(String ncbiBuild) {
        this.ncbiBuild = ncbiBuild;
    }

    public String getCHROMOSOME() {
        return this.chromosome == null ? "" : this.chromosome;
    }

    public void setCHROMOSOME(String chromosome) {
        this.chromosome = chromosome;
    }

    public String getSTART_POSITION() {
        return this.startPosition == null ? "" : this.startPosition;
    }

    public void setSTART_POSITION(String startPosition) {
        this.startPosition = startPosition;
    }

    public String getEND_POSITION() {
        return this.endPosition == null ? "" : this.endPosition;
    }

    public void setEND_POSITION(String endPosition) {
        this.endPosition = endPosition;
    }

    public String getSTRAND() {
        return this.strand == null ? "" : this.strand;
    }

    public void setSTRAND(String strand) {
        this.strand = strand;
    }

    public String getVARIANT_CLASSIFICATION() {
        return this.variantClassification == null ? "" : this.variantClassification;
    }

    public void setVARIANT_CLASSIFICATION(String variantClassification) {
        this.variantClassification = variantClassification;
    }

    public String getVARIANT_TYPE() {
        return this.variantType == null ? "" : this.variantType;
    }

    public void setVARIANT_TYPE(String variantType) {
        this.variantType = variantType;
    }

    public String getREFERENCE_ALLELE() {
        return this.referenceAllele == null ? "" : this.referenceAllele;
    }

    public void setREFERENCE_ALLELE(String referenceAllele) {
        this.referenceAllele = referenceAllele;
    }

    public String getTUMOR_SEQ_ALLELE1() {
        return this.tumorSeqAllele1 == null ? "" : this.tumorSeqAllele1;
    }

    public void setTUMOR_SEQ_ALLELE1(String tumorSeqAllele1) {
        this.tumorSeqAllele1 = tumorSeqAllele1;
    }

    public String getTUMOR_SEQ_ALLELE2() {
        return this.tumorSeqAllele2 == null ? "" : this.tumorSeqAllele2;
    }

    public void setTUMOR_SEQ_ALLELE2(String tumorSeqAllele2) {
        this.tumorSeqAllele2 = tumorSeqAllele2;
    }

    public String getDBSNP_RS() {
        return this.dbSnpRs == null ? "" : this.dbSnpRs;
    }

    public void setDBSNP_RS(String dbSnpRs) {
        this.dbSnpRs = dbSnpRs;
    }

    public String getDBSNP_VAL_STATUS() {
        return this.dbSnpValStatus == null ? "" : this.dbSnpValStatus;
    }

    public void setDBSNP_VAL_STATUS(String dbSnpValStatus) {
        this.dbSnpValStatus = dbSnpValStatus;
    }

    public String getTUMOR_SAMPLE_BARCODE() {
        return this.tumorSampleBarcode == null ? "" : this.tumorSampleBarcode;
    }

    public void setTUMOR_SAMPLE_BARCODE(String tumorSampleBarcode) {
        this.tumorSampleBarcode = tumorSampleBarcode;
    }

    public String getMATCHED_NORM_SAMPLE_BARCODE() {
        return this.matchedNormSampleBarcode == null ? "" : this.matchedNormSampleBarcode;
    }

    public void setMATCHED_NORM_SAMPLE_BARCODE(String matchedNormSampleBarcode) {
        this.matchedNormSampleBarcode = matchedNormSampleBarcode;
    }

    public String getMATCH_NORM_SEQ_ALLELE1() {
        return this.matchNormValidationAllele1 == null ? "" : this.matchedNormSeqAllele1;
    }

    public void setMATCH_NORM_SEQ_ALLELE1(String matchedNormSeqAllele1) {
        this.matchedNormSeqAllele1 = matchedNormSeqAllele1;
    }

    public String getMATCH_NORM_SEQ_ALLELE2() {
        return this.matchNormValidationAllele2 == null ? "" : this.matchedNormSeqAllele2;
    }

    public void setMATCH_NORM_SEQ_ALLELE2(String matchedNormSeqAllele2) {
        this.matchedNormSeqAllele2 = matchedNormSeqAllele2;
    }

    public String getTUMOR_VALIDATION_ALLELE1() {
        return this.tumorValidationAllele1 == null ? "" : this.tumorValidationAllele1;
    }

    public void setTUMOR_VALIDATION_ALLELE1(String tumorValidationAllele1) {
        this.tumorValidationAllele1 = tumorValidationAllele1;
    }

    public String getTUMOR_VALIDATION_ALLELE2() {
        return this.tumorValidationAllele2 == null ? "" : this.tumorValidationAllele2;
    }

     public void setTUMOR_VALIDATION_ALLELE2(String tumorValidationAllele2) {
        this.tumorValidationAllele2 = tumorValidationAllele2;
    }

    public String getMATCH_NORM_VALIDATION_ALLELE1() {
        return this.matchNormValidationAllele1 == null ? "" : this.matchNormValidationAllele1;
    }

    public void setMATCH_NORM_VALIDATION_ALLELE1(String matchNormValidationAllele1) {
        this.matchNormValidationAllele1 = matchNormValidationAllele1;
    }

    public String getMATCH_NORM_VALIDATION_ALLELE2() {
        return this.matchNormValidationAllele2 == null ? "" : this.matchNormValidationAllele2;
    }

    public void setMATCH_NORM_VALIDATION_ALLELE2(String matchNormValidationAllele2) {
        this.matchNormValidationAllele2 = matchNormValidationAllele2;
    }

    public String getVERIFICATION_STATUS() {
        return this.verificationStatus == null ? "" : this.verificationStatus;
    }

    public void setVERIFICATION_STATUS(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getVALIDATION_STATUS() {
        return this.validationStatus == null ? "" : this.validationStatus;
    }

    public void setVALIDATION_STATUS(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    public String getMUTATION_STATUS() {
        return this.mutationStatus == null ? "" : this.mutationStatus;
    }

    public void setMUTATION_STATUS(String mutationStatus) {
        this.mutationStatus = mutationStatus;
    }

    public String getSEQUENCING_PHASE() {
        return this.sequencingPhase == null ? "" : this.sequencingPhase;
    }

    public void setSEQUENCING_PHASE(String sequencingPhase) {
        this.sequencingPhase = sequencingPhase;
    }

    public String getSEQUENCE_SOURCE() {
        return this.sequencingSource == null ? "" : this.sequencingSource;
    }

    public void setSEQUENCE_SOURCE(String sequencingSource) {
        this.sequencingSource = sequencingSource;
    }

    public String getVALIDATION_METHOD() {
        return this.validationMethod == null ? "" : validationMethod;
    }

    public void setVALIDATION_METHOD(String validationMethod) {
        this.validationMethod = validationMethod;
    }

    public String getSCORE() {
        return this.score == null ? "" : this.score;
    }

    public void setSCORE(String score) {
        this.score = score;
    }

    public String getBAM_FILE() {
        return this.bamFile == null ? "" : this.bamFile;
    }

    public void setBAM_FILE(String bamFile) {
        this.bamFile = bamFile;
    }

    public String getSEQUENCER() {
        return this.sequencer == null ? "" : this.sequencer;
    }

    public void setSEQUENCER(String sequencer) {
        this.sequencer = sequencer;
    }

    public String getTUMOR_SAMPLE_UUID() {
        return this.tumorSampleUUID == null ? "" : this.tumorSampleUUID;
    }

    public void setTUMOR_SAMPLE_UUID(String tumorSampleUUID) {
        this.tumorSampleUUID = tumorSampleUUID;
    }

    public String getMATCHED_NORM_SAMPLE_UUID() {
        return this.matchedNormSampleUUID == null ? "" : this.matchedNormSampleUUID;
    }

    public void setMATCHED_NORM_SAMPLE_UUID(String matchedNormSampleUUID) {
        this.matchedNormSampleUUID = matchedNormSampleUUID;
    }

    public String getT_REF_COUNT() {
        return this.tRefCount == null ? "" : this.tRefCount;
    }

    public void setT_REF_COUNT(String tRefCount) {
        this.tRefCount = tRefCount;
    }

    public String getT_ALT_COUNT() {
        return this.tAltCount == null ? "" : this.tAltCount;
    }

    public void setT_ALT_COUNT(String tAltCount) {
        this.tAltCount = tAltCount;
    }

    public String getN_REF_COUNT() {
        return this.nRefCount == null ? "" : this.nRefCount;
    }

    public void setN_REF_COUNT(String nRefCount) {
        this.nRefCount = nRefCount;
    }

    public String getN_ALT_COUNT() {
        return this.nAltCount == null ? "" : this.nAltCount;
    }

    public void setN_ALT_COUNT(String nAltCount) {
        this.nAltCount = nAltCount;
    }

    public String getDIPLOGR() {
        return dipLogR;
    }

    public void setDIPLOGR(String dipLogR) {
        this.dipLogR = dipLogR;
    }

    public String getCF() {
        return cellularFraction;
    }

    public void setCF(String cellularFraction) {
        this.cellularFraction = cellularFraction;
    }

    public String getTCN() {
        return totalCopyNumber;
    }

    public void setTCN(String totalCopyNumber) {
        this.totalCopyNumber = totalCopyNumber;
    }

    public String getLCN() {
        return minorCopyNumber;
    }

    public void setLCN(String minorCopyNumber) {
        this.minorCopyNumber = minorCopyNumber;
    }

    public String getCF_EM() {
        return cellularFractionEm;
    }

    public void setCF_EM(String cellularFractionEm) {
        this.cellularFractionEm = cellularFractionEm;
    }

    public String getTCN_EM() {
        return totalCopyNumberEm;
    }

    public void setTCN_EM(String totalCopyNumberEm) {
        this.totalCopyNumberEm = totalCopyNumberEm;
    }

    public String getLCN_EM() {
        return minorCopyNumberEm;
    }

    public void setLCN_EM(String minorCopyNumberEm) {
        this.minorCopyNumberEm = minorCopyNumberEm;
    }

    public String getPURITY() {
        return purity;
    }

    public void setPURITY(String purity) {
        this.purity = purity;
    }

    public String getPLOIDY() {
        return ploidy;
    }

    public void setPLOIDY(String ploidy) {
        this.ploidy = ploidy;
    }

    public String getCCF_MCOPIES() {
        return ccfMCopies;
    }

    public void setCCF_MCOPIES(String ccfMCopies) {
        this.ccfMCopies = ccfMCopies;
    }

    public String getCCF_MCOPIES_LOWER() {
        return ccfMCopiesLower;
    }

    public void setCCF_MCOPIES_LOWER(String ccfMCopiesLower) {
        this.ccfMCopiesLower = ccfMCopiesLower;
    }

    public String getCCF_MCOPIES_UPPER() {
        return ccfMCopiesUpper;
    }

    public void setCCF_MCOPIES_UPPER(String ccfMCopiesUpper) {
        this.ccfMCopiesUpper = ccfMCopiesUpper;
    }

    public String getCCF_MCOPIES_PROB95() {
        return ccfMCopiesProb95;
    }

    public void setCCF_MCOPIES_PROB95(String ccfMCopiesProb95) {
        this.ccfMCopiesProb95 = ccfMCopiesProb95;
    }

    public String getCCF_MCOPIES_PROB90() {
        return ccfMCopiesProb90;
    }

    public void setCCF_MCOPIES_PROB90(String ccfMCopiesProb90) {
        this.ccfMCopiesProb90 = ccfMCopiesProb90;
    }

    public String getCCF_MCOPIES_EM() {
        return ccfMCopiesEm;
    }

    public void setCCF_MCOPIES_EM(String ccfMCopiesEm) {
        this.ccfMCopiesEm = ccfMCopiesEm;
    }

    public String getCCF_MCOPIES_LOWER_EM() {
        return ccfMCopiesLowerEm;
    }

    public void setCCF_MCOPIES_LOWER_EM(String ccfMCopiesLowerEm) {
        this.ccfMCopiesLowerEm = ccfMCopiesLowerEm;
    }

    public String getCCF_MCOPIES_UPPER_EM() {
        return ccfMCopiesUpperEm;
    }

    public void setCCF_MCOPIES_UPPER_EM(String ccfMCopiesUpperEm) {
        this.ccfMCopiesUpperEm = ccfMCopiesUpperEm;
    }

    public String getCCF_MCOPIES_PROB95_EM() {
        return ccfMCopiesProb95Em;
    }

    public void setCCF_MCOPIES_PROB95_EM(String ccfMCopiesProb95Em) {
        this.ccfMCopiesProb95Em = ccfMCopiesProb95Em;
    }

    public String getCCF_MCOPIES_PROB90_EM() {
        return ccfMCopiesProb90Em;
    }

    public void setCCF_MCOPIES_PROB90_EM(String ccfMCopiesProb90Em) {
        this.ccfMCopiesProb90Em = ccfMCopiesProb90Em;
    }

    public void addAdditionalProperty(String property, String value) {
        this.additionalProperties.put(property, value);
    }

    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperties(Map<String, String> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public List<String> getHeaderWithAdditionalFields() {
        List<String> headerWithAdditionalFields = new ArrayList<>();
        headerWithAdditionalFields.addAll(header);

        for (String field : additionalProperties.keySet()) {
            if (!headerWithAdditionalFields.contains(field)) {
                headerWithAdditionalFields.add(field);
            }
        }
        return headerWithAdditionalFields;
    }

    public List<String> getHeader() {
        return  header;
    }

    public void initHeader() {
        header.add("Hugo_Symbol");
        header.add("Entrez_Gene_Id");
        header.add("Center");
        header.add("NCBI_Build");
        header.add("Chromosome");
        header.add("Start_Position");
        header.add("End_Position");
        header.add("Strand");
        header.add("Variant_Classification");
        header.add("Variant_Type");
        header.add("Reference_Allele");
        header.add("Tumor_Seq_Allele1");
        header.add("Tumor_Seq_Allele2");
        header.add("dbSNP_RS");
        header.add("dbSNP_Val_Status");
        header.add("Tumor_Sample_Barcode");
        header.add("Matched_Norm_Sample_Barcode");
        header.add("Match_Norm_Seq_Allele1");
        header.add("Match_Norm_Seq_Allele2");
        header.add("Tumor_Validation_Allele1");
        header.add("Tumor_Validation_Allele2");
        header.add("Match_Norm_Validation_Allele1");
        header.add("Match_Norm_Validation_Allele2");
        header.add("Verification_Status");
        header.add("Validation_Status");
        header.add("Mutation_Status");
        header.add("Sequencing_Phase");
        header.add("Sequence_Source");
        header.add("Validation_Method");
        header.add("Score");
        header.add("BAM_File");
        header.add("Sequencer");
        header.add("t_ref_count");
        header.add("t_alt_count");
        header.add("n_ref_count");
        header.add("n_alt_count");
        header.add("dipLogR");
        header.add("cf");
        header.add("tcn");
        header.add("lcn");
        header.add("cf.em");
        header.add("tcn.em");
        header.add("lcn.em");
        header.add("purity");
        header.add("ploidy");
        header.add("ccf_Mcopies");
        header.add("ccf_Mcopies_lower");
        header.add("ccf_Mcopies_upper");
        header.add("ccf_Mcopies_prob95");
        header.add("ccf_Mcopies_prob90");
        header.add("ccf_Mcopies_em");
        header.add("ccf_Mcopies_lower_em");
        header.add("ccf_Mcopies_upper_em");
        header.add("ccf_Mcopies_prob95_em");
        header.add("ccf_Mcopies_prob90_em");
    }
}
