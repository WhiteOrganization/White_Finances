/*
 *  Filename:  Concept.java
 *  Creation Date:  May 19, 2020
 *  Purpose:   
 *  Author:    Obed Vazquez
 *  E-mail:    obed.vazquez@gmail.com
 * 
 *  *** Creative Commons Attribution 4.0 International Public License ***
 *  Web Version: https://creativecommons.org/licenses/by/4.0/legalcode
 * 
 * By exercising the Licensed Rights (defined below), You accept and agree to be bound by the terms and conditions of this Creative Commons Attribution 4.0 International Public License ("Public License"). To the extent this Public License may be interpreted as a contract, You are granted the Licensed Rights in consideration of Your acceptance of these terms and conditions, and the Licensor grants You such rights in consideration of benefits the Licensor receives from making the Licensed Material available under these terms and conditions.
 * 
 * Section 1 – Definitions.
 * 
 * Adapted Material means material subject to Copyright and Similar Rights that is derived from or based upon the Licensed Material and in which the Licensed Material is translated, altered, arranged, transformed, or otherwise modified in a manner requiring permission under the Copyright and Similar Rights held by the Licensor. For purposes of this Public License, where the Licensed Material is a musical work, performance, or sound recording, Adapted Material is always produced where the Licensed Material is synched in timed relation with a moving image.
 * Adapter's License means the license You apply to Your Copyright and Similar Rights in Your contributions to Adapted Material in accordance with the terms and conditions of this Public License.
 * Copyright and Similar Rights means copyright and/or similar rights closely related to copyright including, without limitation, performance, broadcast, sound recording, and Sui Generis Database Rights, without regard to how the rights are labeled or categorized. For purposes of this Public License, the rights specified in Section 2(b)(1)-(2) are not Copyright and Similar Rights.
 * Effective Technological Measures means those measures that, in the absence of proper authority, may not be circumvented under laws fulfilling obligations under Article 11 of the WIPO Copyright Treaty adopted on December 20, 1996, and/or similar international agreements.
 * Exceptions and Limitations means fair use, fair dealing, and/or any other exception or limitation to Copyright and Similar Rights that applies to Your use of the Licensed Material.
 * Licensed Material means the artistic or literary work, database, or other material to which the Licensor applied this Public License.
 * Licensed Rights means the rights granted to You subject to the terms and conditions of this Public License, which are limited to all Copyright and Similar Rights that apply to Your use of the Licensed Material and that the Licensor has authority to license.
 * Licensor means the individual(s) or entity(ies) granting rights under this Public License.
 * Share means to provide material to the public by any means or process that requires permission under the Licensed Rights, such as reproduction, public display, public performance, distribution, dissemination, communication, or importation, and to make material available to the public including in ways that members of the public may access the material from a place and at a time individually chosen by them.
 * Sui Generis Database Rights means rights other than copyright resulting from Directive 96/9/EC of the European Parliament and of the Council of 11 March 1996 on the legal protection of databases, as amended and/or succeeded, as well as other essentially equivalent rights anywhere in the world.
 * You means the individual or entity exercising the Licensed Rights under this Public License. Your has a corresponding meaning.
 * Section 2 – Scope.
 * 
 * License grant.
 * Subject to the terms and conditions of this Public License, the Licensor hereby grants You a worldwide, royalty-free, non-sublicensable, non-exclusive, irrevocable license to exercise the Licensed Rights in the Licensed Material to:
 * reproduce and Share the Licensed Material, in whole or in part; and
 * produce, reproduce, and Share Adapted Material.
 * Exceptions and Limitations. For the avoidance of doubt, where Exceptions and Limitations apply to Your use, this Public License does not apply, and You do not need to comply with its terms and conditions.
 * Term. The term of this Public License is specified in Section 6(a).
 * Media and formats; technical modifications allowed. The Licensor authorizes You to exercise the Licensed Rights in all media and formats whether now known or hereafter created, and to make technical modifications necessary to do so. The Licensor waives and/or agrees not to assert any right or authority to forbid You from making technical modifications necessary to exercise the Licensed Rights, including technical modifications necessary to circumvent Effective Technological Measures. For purposes of this Public License, simply making modifications authorized by this Section 2(a)(4) never produces Adapted Material.
 * Downstream recipients.
 * Offer from the Licensor – Licensed Material. Every recipient of the Licensed Material automatically receives an offer from the Licensor to exercise the Licensed Rights under the terms and conditions of this Public License.
 * No downstream restrictions. You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, the Licensed Material if doing so restricts exercise of the Licensed Rights by any recipient of the Licensed Material.
 * No endorsement. Nothing in this Public License constitutes or may be construed as permission to assert or imply that You are, or that Your use of the Licensed Material is, connected with, or sponsored, endorsed, or granted official status by, the Licensor or others designated to receive attribution as provided in Section 3(a)(1)(A)(i).
 * Other rights.
 * 
 * Moral rights, such as the right of integrity, are not licensed under this Public License, nor are publicity, privacy, and/or other similar personality rights; however, to the extent possible, the Licensor waives and/or agrees not to assert any such rights held by the Licensor to the limited extent necessary to allow You to exercise the Licensed Rights, but not otherwise.
 * Patent and trademark rights are not licensed under this Public License.
 * To the extent possible, the Licensor waives any right to collect royalties from You for the exercise of the Licensed Rights, whether directly or through a collecting society under any voluntary or waivable statutory or compulsory licensing scheme. In all other cases the Licensor expressly reserves any right to collect such royalties.
 * Section 3 – License Conditions.
 * 
 * Your exercise of the Licensed Rights is expressly made subject to the following conditions.
 * 
 * Attribution.
 * 
 * If You Share the Licensed Material (including in modified form), You must:
 * 
 * retain the following if it is supplied by the Licensor with the Licensed Material:
 * identification of the creator(s) of the Licensed Material and any others designated to receive attribution, in any reasonable manner requested by the Licensor (including by pseudonym if designated);
 * a copyright notice;
 * a notice that refers to this Public License;
 * a notice that refers to the disclaimer of warranties;
 * a URI or hyperlink to the Licensed Material to the extent reasonably practicable;
 * indicate if You modified the Licensed Material and retain an indication of any previous modifications; and
 * indicate the Licensed Material is licensed under this Public License, and include the text of, or the URI or hyperlink to, this Public License.
 * You may satisfy the conditions in Section 3(a)(1) in any reasonable manner based on the medium, means, and context in which You Share the Licensed Material. For example, it may be reasonable to satisfy the conditions by providing a URI or hyperlink to a resource that includes the required information.
 * If requested by the Licensor, You must remove any of the information required by Section 3(a)(1)(A) to the extent reasonably practicable.
 * If You Share Adapted Material You produce, the Adapter's License You apply must not prevent recipients of the Adapted Material from complying with this Public License.
 * Section 4 – Sui Generis Database Rights.
 * 
 * Where the Licensed Rights include Sui Generis Database Rights that apply to Your use of the Licensed Material:
 * 
 * for the avoidance of doubt, Section 2(a)(1) grants You the right to extract, reuse, reproduce, and Share all or a substantial portion of the contents of the database;
 * if You include all or a substantial portion of the database contents in a database in which You have Sui Generis Database Rights, then the database in which You have Sui Generis Database Rights (but not its individual contents) is Adapted Material; and
 * You must comply with the conditions in Section 3(a) if You Share all or a substantial portion of the contents of the database.
 * For the avoidance of doubt, this Section 4 supplements and does not replace Your obligations under this Public License where the Licensed Rights include other Copyright and Similar Rights.
 * Section 5 – Disclaimer of Warranties and Limitation of Liability.
 * 
 * Unless otherwise separately undertaken by the Licensor, to the extent possible, the Licensor offers the Licensed Material as-is and as-available, and makes no representations or warranties of any kind concerning the Licensed Material, whether express, implied, statutory, or other. This includes, without limitation, warranties of title, merchantability, fitness for a particular purpose, non-infringement, absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not known or discoverable. Where disclaimers of warranties are not allowed in full or in part, this disclaimer may not apply to You.
 * To the extent possible, in no event will the Licensor be liable to You on any legal theory (including, without limitation, negligence) or otherwise for any direct, special, indirect, incidental, consequential, punitive, exemplary, or other losses, costs, expenses, or damages arising out of this Public License or use of the Licensed Material, even if the Licensor has been advised of the possibility of such losses, costs, expenses, or damages. Where a limitation of liability is not allowed in full or in part, this limitation may not apply to You.
 * The disclaimer of warranties and limitation of liability provided above shall be interpreted in a manner that, to the extent possible, most closely approximates an absolute disclaimer and waiver of all liability.
 * Section 6 – Term and Termination.
 * 
 * This Public License applies for the term of the Copyright and Similar Rights licensed here. However, if You fail to comply with this Public License, then Your rights under this Public License terminate automatically.
 * Where Your right to use the Licensed Material has terminated under Section 6(a), it reinstates:
 * 
 * automatically as of the date the violation is cured, provided it is cured within 30 days of Your discovery of the violation; or
 * upon express reinstatement by the Licensor.
 * For the avoidance of doubt, this Section 6(b) does not affect any right the Licensor may have to seek remedies for Your violations of this Public License.
 * For the avoidance of doubt, the Licensor may also offer the Licensed Material under separate terms or conditions or stop distributing the Licensed Material at any time; however, doing so will not terminate this Public License.
 * Sections 1, 5, 6, 7, and 8 survive termination of this Public License.
 * Section 7 – Other Terms and Conditions.
 * 
 * The Licensor shall not be bound by any additional or different terms or conditions communicated by You unless expressly agreed.
 * Any arrangements, understandings, or agreements regarding the Licensed Material not stated herein are separate from and independent of the terms and conditions of this Public License.
 * Section 8 – Interpretation.
 * 
 * For the avoidance of doubt, this Public License does not, and shall not be interpreted to, reduce, limit, restrict, or impose conditions on any use of the Licensed Material that could lawfully be made without permission under this Public License.
 * To the extent possible, if any provision of this Public License is deemed unenforceable, it shall be automatically reformed to the minimum extent necessary to make it enforceable. If the provision cannot be reformed, it shall be severed from this Public License without affecting the enforceability of the remaining terms and conditions.
 * No term or condition of this Public License will be waived and no failure to comply consented to unless expressly agreed to by the Licensor.
 * Nothing in this Public License constitutes or may be interpreted as a limitation upon, or waiver of, any privileges and immunities that apply to the Licensor or You, including from the legal processes of any jurisdiction or authority.
 * Creative Commons is not a party to its public licenses. Notwithstanding, Creative Commons may elect to apply one of its public licenses to material it publishes and in those instances will be considered the “Licensor.” The text of the Creative Commons public licenses is dedicated to the public domain under the CC0 Public Domain Dedication. Except for the limited purpose of indicating that material is shared under a Creative Commons public license or as otherwise permitted by the Creative Commons policies published at creativecommons.org/policies, Creative Commons does not authorize the use of the trademark “Creative Commons” or any other trademark or logo of Creative Commons without its prior written consent including, without limitation, in connection with any unauthorized modifications to any of its public licenses or any other arrangements, understandings, or agreements concerning use of licensed material. For the avoidance of doubt, this paragraph does not form part of the public licenses.
 * 
 * Creative Commons may be contacted at creativecommons.org.
 */
package org.white_sdev.white_finances.model.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.white_sdev.white_finances.exception.White_FinancesException;
import org.white_sdev.white_finances.model.persistence.security.Family;
import static org.white_sdev.white_validations.parameters.ParameterValidator.notNullValidation;

/**
 * One of the main {@link Entity entities} of the Application Representing one of the most basic elements of it.
 * A concept is the element onto which the user can logically organize its spending or income and categorize it.
 * It is used in both {@link FinanceRecord} while budgeting in {@link BudgetRecord} or in {@link Transaction}s.
 *
 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * @since May 13, 2020
 */
@Entity
@Data //Getters&Setters for all attributes
@Slf4j
public class Concept implements Persistable {

    //<editor-fold defaultstate="collapsed" desc="Attributes">

    /**
     * {@link Id} of the {@link Concept} {@Entity}. Controlled by the framework and generated automatically, all id(s) are configured this way unless a field that will never change
     * is clearly found in the {@link Entity} structure.
     *
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-05-21
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * The {@link Family} to whom <code>this</code> {@link Concept} belongs to.
     * There should not be a @{link Concept} without a {@link family} except for those controlled by the application.
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-10-08
     */
    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Family family;
    
    /**
     * The name of the Concept. This is the most representative field of the {@link Concept} object; ought to be unique and there shouldn't be another {@link Entity} with the same
     * name and different {@link Id}.
     *
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-05-19
     */
    @Column(unique = true)
    @NotBlank
    private String name;

    /**
     * The specified {@link Concept} that will function as a category for <b>this</b> one. Making this a sub{@link Concept} of its parent and injecting it into its
     * {@link #subConcepts} attributes. This implies a recursive relationship where a {@link Concept} can have many {@link Concept subConcepts} establishing this way a
     * {@link Concept} tree hierarchy.
     *
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-05-21
     * @see #subConcepts
     */
    @ManyToOne(fetch= FetchType.LAZY)
//    @JoinColumn(name = "subConcepts")
    private Concept superConcept;

    /**
     * The {@link Set} of {@link Concept Concepts} categorized under <code>this</code> {@link Concept} as subConcepts. This {@link Set} of {@link Concept Concepts} turn
     * <code>this</code> into a category if they are initialized and greater than 0.
     *
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-05-22
     * @see #superConcept
     */
    @OneToMany(mappedBy = "superConcept", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
    private Set<Concept> subConcepts = new HashSet<>();

    /**
     * Any comments that the user will define to identify the concept more easily.
     *
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-05-22
     */
    private String comments;



    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Methods">
    
    /**
     * Required no-Arguments Constructor by 
     * <a href="https://docs.jboss.org/hibernate/core/3.5/reference/en/html/persistent-classes.html#persistent-classes-pojo-constructor">Hibernate</a>.
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-05-21
     */
    protected Concept() { }
    
    /**
     * Default Constructor of the class providing solely the {@link String name} and {@link Family} of the Concept.Initial setup; The name of the concept being the most 
     * representative attribute of the {@link Entity}, This method receives the name of the concept, then initializes it and ignores the rest of the attributes of the entity.
     *
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @param family The {@link Family} to whom <code>this</code> {@link Concept} belongs to
     * @since 2020-05-21
     * @param name String to perform the operation with.
     * @throws IllegalArgumentException - if the argument provided is null.
     */
    public Concept(String name, Family family) {
	log.trace("::Concept(name) - Start: Constructor");
	notNullValidation(new Object[]{name,family},"The name and familly of the Concept must be provided to create an instance.");
	try {

	    this.name = name;
	    this.family=family;

	    log.trace("::Concept(name) - Finish: Constructor");
	} catch (Exception e) {
	    throw new White_FinancesException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    @java.lang.Override
    public java.lang.String toString() {
	return "Concept(id=" + this.getId() + ", name=" + this.getName() + ", superConcept=" + 
			    (this.getSuperConcept()!=null?this.getSuperConcept().getName():"null") + 
			    ", subConcepts=" + this.getSubConcepts() + ", comments=" + this.getComments() + ")";
    }

    /**
     * Compares both {@link Persistable Persistables} {@link Entity Entities} properties and returns wheather they have the exact same elements or not.
     * Compares the actual object with the one provided.
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-06-12
     * @param persistible The second {@link Persisitible} {@linnk Object} to compare with <code>this</code>.
     * @return <code>true</code> in case both objects are clones, <code>false</code> in case the provided parameter is null.
     */
    public boolean isClone(Concept persistible){ 
	log.trace("::isClone(persistible) - Start: ");
	if (persistible==null) return false;
	try{
	    
	    if(!Objects.equals(getId(), persistible.getId()))return false;
	    if(!(getName() == null ? persistible.getName() == null : getName().equals(persistible.getName())))return false;
	    if(!(getSuperConcept()==persistible.getSuperConcept()))return false;
	    if(!(getSubConcepts().equals( persistible.getSubConcepts() )))return false;
	    if(!(getComments() == null? true : getComments().equals(persistible.getComments())))return false;
	    
	    log.trace("::isClone(persistible) - Finish: ");
	    return true;
	    
	} catch (Exception e) {
	    log.debug("::isClone(persistible) - Exception: "+e);
            throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
        }
    }
    

    /**
     * Adds the given {@link Concept Concept(s)} to the set of {@link #subConcepts} of <code>this</code> {@link Concept} instance. 
     * As a result, {@link Concept this Concept} will be added as {@link #superConcept} for the provided {@link Concept Concept(s)}.
     * This method is a bridge and uses {@link #addSubConcepts(java.util.Collection) } to complete his objective.
     *
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-09-07
     * @param subConcepts {@link Concept Concept(s)} to add to the {@link #subConcepts} {@link HashSet} already configured as {@link #subConcepts} of
     * <code>this</code>. In case there are no {@link #subConcepts} they will be initialized, and in case the provided {@link Collection} of {@link Concept Concepts} 
     * is null or empty they will be ignored.
     */
    public void addSubConcepts(Concept... subConcepts) {
	log.trace("::addSubConcepts(Concept... subConcepts) - Start: ");
	addSubConcepts(new ArrayList<>(Arrays.asList(subConcepts)));
	log.trace("::addSubConcepts(Concept... subConcepts) - Finish: ");
    }

    /**
     * Adds the given {@link Collection} of {@link Concept Concepts} to the set of {@link #subConcepts} of <code>this</code> instance. 
     * As a result, {@link Concept this Concept} will be added as {@link #superConcept} for the provided {link Collection} of {@link Concept Concepts}.
     *
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-09-07
     * @param subConcepts {@link Collection} of {@link Concept Concepts} to add to the {@link #subConcepts} {@link HashSet} already configured as {@link #subConcepts} of
     * <code>this</code>. In case there are no {@link #subConcepts} they will be initialized, and in case the provided {@link Collection} of {@link Concept Concepts} 
     * is null or empty they will be ignored.
     */
    public void addSubConcepts(Collection<Concept> subConcepts) {
	log.trace("::addSubConcepts(Collection<Concept> subConcepts) - Start: ");
	if (subConcepts == null || subConcepts.size() < 1) {
	    log.trace("::addSubConcepts(Collection<Concept> subConcepts) - Finish: Called with empty or nulled concepts to add");
	    return;
	}
	try {

	    if (this.getSubConcepts() == null) this.setSubConcepts(new HashSet<>());
	    for (Concept subConcept : subConcepts) {
		//<editor-fold defaultstate="collapsed" desc="Individual Validations">
		if (subConcept == null) continue;
		if (this == subConcept || subConcept.equals(this)) {
		    log.warn("::addSubConcepts(Collection<Concept> subConcepts) The caller is trying to asign a concept as its own subConcept: \n"
			    + "\t\t\t" + subConcept + ". \n"
			    + "\t\t\t" + "Attempt to breake Business rule is rejected and ignored.");
		    continue;
		}
		//</editor-fold>
		this.getSubConcepts().add(subConcept); //Main Operation
		subConcept.setSuperConcept(this);
	    }

	    log.trace("::addSubConcepts(Collection<Concept> subConcepts) - Finish: ");
	} catch (Exception e) {
	    log.debug("::addSubConcepts(Collection<Concept> subConcepts) - Exception: " + e);
	    throw new White_FinancesException("Impossible to add the Concepts as subConcepts of the element due tu an Unknown error.", e);
	}
    }
    //</editor-fold>
    
}
