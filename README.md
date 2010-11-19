Seam Clouds
===========

This module contains integration between for popular cloud frameworks and CDI.


JClouds
-------

Configuration and injection of the JClouds BlobStore and ComputeSercice is provided.


Infinispan
----------

Configuration and injection of the Inifispan's Cache API is provided, as well as bridging Cache listeners to the CDI event system.


Running the tests
-----------------

To run the tests, you must have an AWS account, and sign up for S3. Having done this,
create the file src/test/resources/aws.properties

    jclouds.identity <AccessKeyId>
    jclouds.credential <SecretAccessKey>
