/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use. 
Code and policy for a production application must be developed to meet the specific data and 
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED 
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR 
FITNESS FOR A PARTICULAR PURPOSE.
*/
package net.docusign.ws3_0;

import org.junit.Assert;
import org.junit.Test;

/**
 * Ping the webservice to make sure we're integrating properly.
 */
public class PingTest extends WebserviceTestCase {
	
	@Test
	public void testPingService() {
	    Assert.assertNotNull(api);
    	Assert.assertTrue(api.ping());    		 
	}
}
