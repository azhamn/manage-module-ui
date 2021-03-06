/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * <p>
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.dep.manageservice.resource.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorDTO {

	private RequestError requestError = null;

	public RequestError getRequestError() {
		return requestError;
	}

	public void setRequestError(RequestError requestError) {
		this.requestError = requestError;
	}

	public static class RequestError {

		private ServiceException serviceException = null;

		public ServiceException getServiceException() {
			return serviceException;
		}

		public void setServiceException(ServiceException serviceException) {
			this.serviceException = serviceException;
		}

		public static class ServiceException {

			private String messageId = null;
			private String text = null;

			public String getMessageId() {
				return messageId;
			}

			public void setMessageId(String messageId) {
				this.messageId = messageId;
			}

			public String getText() {
				return text;
			}

			public void setText(String text) {
				this.text = text;
			}
		}
	}
}
